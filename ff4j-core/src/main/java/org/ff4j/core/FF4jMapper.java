package org.ff4j.core;

/*
 * #%L
 * ff4j-core
 * %%
 * Copyright (C) 2013 - 2016 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Mapping from Store to Java.
 *
 * @author Cedrick LUNVEN (@clunven)
 *
 * @param <BEAN>
 *      current java Bean
 * @param <REQ>
 *      bean represent a request for storage to persist
 * @param <RES>
 *      bean represent a request for storage to persist
 */
public interface FF4jMapper < BEAN, REQ, RES > {
    
    /**
     * Convert object from store driver/client to FF4J framework Object.
     *
     * @param bean
     *      current bean
     * @return
     *      store object
     */
    REQ mapToRepository(BEAN bean);
    
    /**
     * From DB to Java transformation.
     *
     * @param bean
     *      target bean
     * @return
     *      the JAVA BEAN
     */
    BEAN mapFromRepository(RES bean);

}