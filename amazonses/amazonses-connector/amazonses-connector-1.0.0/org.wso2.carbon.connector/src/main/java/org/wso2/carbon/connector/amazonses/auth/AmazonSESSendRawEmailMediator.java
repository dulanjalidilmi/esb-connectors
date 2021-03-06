/*
 *  Copyright (c) 2005-2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.connector.amazonses.auth;

import java.util.HashMap;
import java.util.Map;

import org.wso2.carbon.connector.amazonses.constants.AmazonSESConstants;

/**
 * The Class AmazonSESSendRawEmailMediator used for sendRawEmail method.
 */
public class AmazonSESSendRawEmailMediator extends AmazonSESMediatorBase {
    
    /**
     * Gets the single valued parameters map.
     * 
     * @return the single valued parameters map
     */
    @Override
    protected final Map<String, String> getSingleValuedParametersMap() {
    
        Map<String, String> parameterMap = new HashMap<String, String>();
        parameterMap.put(AmazonSESConstants.API_RAW_MESSAGE, AmazonSESConstants.ESB_RAW_MESSAGE);
        parameterMap.put(AmazonSESConstants.API_SOURCE_ADDRESS, AmazonSESConstants.ESB_SOURCE_ADDRESS);
        return parameterMap;
    }
    
    /**
     * Gets the multi valued parameters map.
     * 
     * @return the multi valued parameters map
     */
    @Override
    protected final Map<String, String> getMultiValuedParametersMap() {
    
        Map<String, String> parameterMap = new HashMap<String, String>();
        parameterMap.put(AmazonSESConstants.API_DESTINATIONS, AmazonSESConstants.ESB_DESTINATIONS);
        return parameterMap;
    }
    
}
