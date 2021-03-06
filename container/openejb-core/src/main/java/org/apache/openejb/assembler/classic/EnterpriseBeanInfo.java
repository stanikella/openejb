/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.assembler.classic;

import java.util.List;
import java.util.ArrayList;

public abstract class EnterpriseBeanInfo extends InfoObject {

    public static final int ENTITY = 0;

    public static final int STATEFUL = 1;

    public static final int STATELESS = 2;

    public static final int MESSAGE = 3;

    public int type;

    public String codebase;
    public String description;
    public String displayName;
    public String smallIcon;
    public String largeIcon;
    public String ejbDeploymentId;
    public String home;
    public String remote;
    public String localHome;
    public String local;
    public final List<String> businessLocal = new ArrayList<String>();
    public final List<String> businessRemote = new ArrayList<String>();
    public String ejbClass;
    public String ejbName;

    public String transactionType;
    public JndiEncInfo jndiEnc;
    public NamedMethodInfo timeoutMethod;

    public String runAs;

    public final List<SecurityRoleReferenceInfo> securityRoleReferences = new ArrayList<SecurityRoleReferenceInfo>();

    public final List<CallbackInfo> aroundInvoke = new ArrayList<CallbackInfo>();

    public final List<CallbackInfo> postConstruct = new ArrayList<CallbackInfo>();
    public final List<CallbackInfo> preDestroy = new ArrayList<CallbackInfo>();

    public String containerId;
    public String serviceEndpoint;

    public List<String> jndiNames = new ArrayList<String>();
}
