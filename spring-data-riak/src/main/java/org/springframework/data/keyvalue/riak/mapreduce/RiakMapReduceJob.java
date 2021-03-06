/*
 * Copyright (c) 2010 by J. Brisbin <jon@jbrisbin.com>
 *     Portions (c) 2010 by NPC International, Inc. or the
 *     original author(s).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.keyvalue.riak.mapreduce;

import org.springframework.data.keyvalue.riak.core.RiakTemplate;

/**
 * An implementation of {@link org.springframework.data.keyvalue.riak.mapreduce.MapReduceJob}
 * for the Riak data store.
 *
 * @author J. Brisbin <jon@jbrisbin.com>
 */
@SuppressWarnings({"unchecked"})
public class RiakMapReduceJob extends AbstractRiakMapReduceJob {

  protected RiakTemplate riakTemplate;

  public RiakMapReduceJob(RiakTemplate riakTemplate) {
    this.riakTemplate = riakTemplate;
  }

  public RiakTemplate getRiakTemplate() {
    return riakTemplate;
  }

  public void setRiakTemplate(RiakTemplate riakTemplate) {
    this.riakTemplate = riakTemplate;
  }

  public Object call() throws Exception {
    return riakTemplate.execute(this);
  }
}
