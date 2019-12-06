/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.model.services;

import com.amazon.ask.model.services.ApiConfiguration;

import com.amazon.ask.model.services.skillManagement.SkillManagementServiceClient;

/**
 * ServiceClientFactory class to help build service clients.
 */
public class ServiceClientFactory {
    // contains config relevant to this request (token, endpoint)
    private ApiConfiguration defaultApiConfiguration;

    private ServiceClientFactory(ApiConfiguration defaultApiConfiguration) {
        this.defaultApiConfiguration = defaultApiConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private ApiConfiguration defaultApiConfiguration;

        private Builder() {
        }

        public Builder withDefaultApiConfiguration(ApiConfiguration defaultApiConfiguration) {
            this.defaultApiConfiguration = defaultApiConfiguration;
            return this;
        }

        public ServiceClientFactory build() {
            return new ServiceClientFactory(defaultApiConfiguration);
        }
    }
}
