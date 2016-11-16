/**
 * Betfair: Exchange Streaming API
 * API to receive streamed updates. This is an ssl socket connection of CRLF delimited json messages (see RequestMessage & ResponseMessage)
 *
 * OpenAPI spec version: 1.0.1423
 * Contact: bdp@betfair.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package trading.marketdata.BetfairStreamAPI.swagger.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AuthenticationMessage;
import io.swagger.client.model.HeartbeatMessage;
import io.swagger.client.model.MarketSubscriptionMessage;
import io.swagger.client.model.OrderSubscriptionMessage;


/**
 * AllRequestTypesExample
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-15T22:47:57.805+11:00")
public class AllRequestTypesExample   {
  /**
   * Gets or Sets opTypes
   */
  public enum OpTypesEnum {
    @SerializedName("heartbeat")
    HEARTBEAT("heartbeat"),
    
    @SerializedName("authentication")
    AUTHENTICATION("authentication"),
    
    @SerializedName("marketSubscription")
    MARKETSUBSCRIPTION("marketSubscription"),
    
    @SerializedName("orderSubscription")
    ORDERSUBSCRIPTION("orderSubscription");

    private String value;

    OpTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("opTypes")
  private OpTypesEnum opTypes = null;

  @SerializedName("heartbeat")
  private HeartbeatMessage heartbeat = null;

  @SerializedName("orderSubscriptionMessage")
  private OrderSubscriptionMessage orderSubscriptionMessage = null;

  @SerializedName("marketSubscription")
  private MarketSubscriptionMessage marketSubscription = null;

  @SerializedName("authentication")
  private AuthenticationMessage authentication = null;

  public AllRequestTypesExample opTypes(OpTypesEnum opTypes) {
    this.opTypes = opTypes;
    return this;
  }

   /**
   * Get opTypes
   * @return opTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public OpTypesEnum getOpTypes() {
    return opTypes;
  }

  public void setOpTypes(OpTypesEnum opTypes) {
    this.opTypes = opTypes;
  }

  public AllRequestTypesExample heartbeat(HeartbeatMessage heartbeat) {
    this.heartbeat = heartbeat;
    return this;
  }

   /**
   * Get heartbeat
   * @return heartbeat
  **/
  @ApiModelProperty(example = "null", value = "")
  public HeartbeatMessage getHeartbeat() {
    return heartbeat;
  }

  public void setHeartbeat(HeartbeatMessage heartbeat) {
    this.heartbeat = heartbeat;
  }

  public AllRequestTypesExample orderSubscriptionMessage(OrderSubscriptionMessage orderSubscriptionMessage) {
    this.orderSubscriptionMessage = orderSubscriptionMessage;
    return this;
  }

   /**
   * Get orderSubscriptionMessage
   * @return orderSubscriptionMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderSubscriptionMessage getOrderSubscriptionMessage() {
    return orderSubscriptionMessage;
  }

  public void setOrderSubscriptionMessage(OrderSubscriptionMessage orderSubscriptionMessage) {
    this.orderSubscriptionMessage = orderSubscriptionMessage;
  }

  public AllRequestTypesExample marketSubscription(MarketSubscriptionMessage marketSubscription) {
    this.marketSubscription = marketSubscription;
    return this;
  }

   /**
   * Get marketSubscription
   * @return marketSubscription
  **/
  @ApiModelProperty(example = "null", value = "")
  public MarketSubscriptionMessage getMarketSubscription() {
    return marketSubscription;
  }

  public void setMarketSubscription(MarketSubscriptionMessage marketSubscription) {
    this.marketSubscription = marketSubscription;
  }

  public AllRequestTypesExample authentication(AuthenticationMessage authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public AuthenticationMessage getAuthentication() {
    return authentication;
  }

  public void setAuthentication(AuthenticationMessage authentication) {
    this.authentication = authentication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllRequestTypesExample allRequestTypesExample = (AllRequestTypesExample) o;
    return Objects.equals(this.opTypes, allRequestTypesExample.opTypes) &&
        Objects.equals(this.heartbeat, allRequestTypesExample.heartbeat) &&
        Objects.equals(this.orderSubscriptionMessage, allRequestTypesExample.orderSubscriptionMessage) &&
        Objects.equals(this.marketSubscription, allRequestTypesExample.marketSubscription) &&
        Objects.equals(this.authentication, allRequestTypesExample.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opTypes, heartbeat, orderSubscriptionMessage, marketSubscription, authentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllRequestTypesExample {\n");
    
    sb.append("    opTypes: ").append(toIndentedString(opTypes)).append("\n");
    sb.append("    heartbeat: ").append(toIndentedString(heartbeat)).append("\n");
    sb.append("    orderSubscriptionMessage: ").append(toIndentedString(orderSubscriptionMessage)).append("\n");
    sb.append("    marketSubscription: ").append(toIndentedString(marketSubscription)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

