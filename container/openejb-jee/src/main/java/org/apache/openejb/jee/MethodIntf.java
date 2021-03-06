/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.openejb.jee;

import javax.xml.bind.annotation.XmlEnumValue;


/**
 * The method-intf element allows a method element to
 * differentiate between the methods with the same name and
 * signature that are multiply defined across the home and
 * component interfaces (e.g, in both an enterprise bean's
 * remote and local interfaces or in both an enterprise bean's
 * home and remote interfaces, etc.); the component and web
 * service endpoint interfaces, and so on. The Local applies to
 * both local component interface and local business interface.
 * Similarly, Remote applies to both remote component interface
 * and the remote business interface.
 * <p/>
 * The method-intf element must be one of the following:
 * <p/>
 * Home
 * Remote
 * LocalHome
 * Local
 * ServiceEndpoint
 */
public enum MethodIntf {
    @XmlEnumValue("Home") HOME("Home"),
    @XmlEnumValue("Remote") REMOTE("Remote"),
    @XmlEnumValue("LocalHome") LOCALHOME("LocalHome"),
    @XmlEnumValue("Local") LOCAL("Local"),
    @XmlEnumValue("ServiceEndpoint") SERVICEENDPOINT("ServiceEndpoint");

    private final String name;

    private MethodIntf(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
    
}
