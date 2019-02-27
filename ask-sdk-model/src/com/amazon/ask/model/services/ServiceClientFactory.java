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

import com.amazon.ask.model.services.deviceAddress.DeviceAddressServiceClient;
import com.amazon.ask.model.services.directive.DirectiveServiceClient;
import com.amazon.ask.model.services.listManagement.ListManagementServiceClient;
import com.amazon.ask.model.services.monetization.MonetizationServiceClient;
import com.amazon.ask.model.services.proactiveEvents.ProactiveEventsServiceClient;
import com.amazon.ask.model.services.reminderManagement.ReminderManagementServiceClient;
import com.amazon.ask.model.services.ups.UpsServiceClient;

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

    public DeviceAddressServiceClient getDeviceAddressService() {
        try {
            return new DeviceAddressServiceClient(this.defaultApiConfiguration);
        } catch(Exception ex) {
            throw new IllegalStateException("Error while initializing DeviceAddressServiceClient: " + ex.getMessage(), ex);
        }
    }
    public DirectiveServiceClient getDirectiveService() {
        try {
            return new DirectiveServiceClient(this.defaultApiConfiguration);
        } catch(Exception ex) {
            throw new IllegalStateException("Error while initializing DirectiveServiceClient: " + ex.getMessage(), ex);
        }
    }
    public ListManagementServiceClient getListManagementService() {
        try {
            return new ListManagementServiceClient(this.defaultApiConfiguration);
        } catch(Exception ex) {
            throw new IllegalStateException("Error while initializing ListManagementServiceClient: " + ex.getMessage(), ex);
        }
    }
    public MonetizationServiceClient getMonetizationService() {
        try {
            return new MonetizationServiceClient(this.defaultApiConfiguration);
        } catch(Exception ex) {
            throw new IllegalStateException("Error while initializing MonetizationServiceClient: " + ex.getMessage(), ex);
        }
    }
    public ReminderManagementServiceClient getReminderManagementService() {
        try {
            return new ReminderManagementServiceClient(this.defaultApiConfiguration);
        } catch(Exception ex) {
            throw new IllegalStateException("Error while initializing ReminderManagementServiceClient: " + ex.getMessage(), ex);
        }
    }
    public UpsServiceClient getUpsService() {
        try {
            return new UpsServiceClient(this.defaultApiConfiguration);
        } catch(Exception ex) {
            throw new IllegalStateException("Error while initializing UpsServiceClient: " + ex.getMessage(), ex);
        }
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
