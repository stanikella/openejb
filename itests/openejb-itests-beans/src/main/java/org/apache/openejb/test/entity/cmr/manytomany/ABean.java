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
package org.apache.openejb.test.entity.cmr.manytomany;

import java.util.Set;
import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.RemoveException;

import org.apache.openejb.test.entity.cmr.CompoundPK;

/**
 *
 * @version $Revision: 451417 $ $Date: 2006-09-29 13:13:22 -0700 (Fri, 29 Sep 2006) $
 */
public abstract class ABean implements EntityBean {

    private EntityContext context;
    
    // CMP
    public abstract Integer getField1();
    public abstract void setField1(Integer field1);

    public abstract String getField2();
    public abstract void setField2(String field2);
    
    // CMR
    public abstract Set<BLocal> getB();
    public abstract void setB(Set<BLocal> bSet);
    
    public Integer ejbCreate(Integer field1)  throws CreateException {
        setField1(field1);
        return null;
    }

    public void ejbPostCreate(Integer field1) {
    }

    public CompoundPK ejbCreate(CompoundPK primaryKey)  throws CreateException {
        setField1(primaryKey.field1);
        setField2(primaryKey.field2);
        return null;
    }

    public void ejbPostCreate(CompoundPK primaryKey) {
    }

    public void setEntityContext(EntityContext ctx) {
        context = ctx;
    }

    public void unsetEntityContext() {
        context = null;
    }

    public void ejbActivate() {
    }

    public void ejbPassivate() {
    }

    public void ejbLoad() {
    }

    public void ejbStore() {
    }

    public void ejbRemove() throws RemoveException {
    }
}
