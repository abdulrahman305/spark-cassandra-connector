/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.datastax.spark.connector;

import java.io.Serializable;

/**
 * This is a sample JavaBean style class. In order to test JavaAPI correctly, we cannot implement this in Scala because
 * Scala adds some additional accessors and mutators.
 */
public class SampleWeirdJavaBean implements Serializable {
    private Integer devil;
    private String cat;

    public static SampleWeirdJavaBean newInstance(Integer key, String value) {
        SampleWeirdJavaBean bean = new SampleWeirdJavaBean();
        bean.setDevil(key);
        bean.setCat(value);
        return bean;
    }

    public Integer getDevil() {
        return devil;
    }

    public void setDevil(Integer devil) {
        this.devil = devil;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
}
