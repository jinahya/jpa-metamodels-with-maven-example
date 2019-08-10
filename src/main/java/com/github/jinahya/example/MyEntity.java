/*
 * Copyright 2014 onacit.
 *
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
 */
package com.github.jinahya.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * An entity.
 *
 * @author Jin Kwon &lt;onacit at gmail.com&gt;
 */
@Entity
public class MyEntity implements Serializable {

    private static final long serialVersionUID = 2386467385199396852L;

    @Id
    private Long id;
}
