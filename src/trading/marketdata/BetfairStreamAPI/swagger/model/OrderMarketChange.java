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
import io.swagger.client.model.OrderRunnerChange;
import java.util.ArrayList;
import java.util.List;


/**
 * OrderMarketChange
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-15T22:47:57.805+11:00")
public class OrderMarketChange   {
  @SerializedName("accountId")
  private Long accountId = null;

  @SerializedName("orc")
  private List<OrderRunnerChange> orc = new ArrayList<OrderRunnerChange>();

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("id")
  private String id = null;

  public OrderMarketChange accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public OrderMarketChange orc(List<OrderRunnerChange> orc) {
    this.orc = orc;
    return this;
  }

  public OrderMarketChange addOrcItem(OrderRunnerChange orcItem) {
    this.orc.add(orcItem);
    return this;
  }

   /**
   * Order Changes - a list of changes to orders on a selection
   * @return orc
  **/
  @ApiModelProperty(example = "null", value = "Order Changes - a list of changes to orders on a selection")
  public List<OrderRunnerChange> getOrc() {
    return orc;
  }

  public void setOrc(List<OrderRunnerChange> orc) {
    this.orc = orc;
  }

  public OrderMarketChange closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public OrderMarketChange id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Market Id - the id of the market the order is on
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Market Id - the id of the market the order is on")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMarketChange orderMarketChange = (OrderMarketChange) o;
    return Objects.equals(this.accountId, orderMarketChange.accountId) &&
        Objects.equals(this.orc, orderMarketChange.orc) &&
        Objects.equals(this.closed, orderMarketChange.closed) &&
        Objects.equals(this.id, orderMarketChange.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, orc, closed, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMarketChange {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    orc: ").append(toIndentedString(orc)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

