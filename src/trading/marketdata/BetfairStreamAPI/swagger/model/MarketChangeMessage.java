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
import io.swagger.client.model.MarketChange;
import io.swagger.client.model.ResponseMessage;
import java.util.ArrayList;
import java.util.List;


/**
 * MarketChangeMessage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-15T22:47:57.805+11:00")
public class MarketChangeMessage extends ResponseMessage  {
  /**
   * Change Type - set to indicate the type of change - if null this is a delta)
   */
  public enum CtEnum {
    @SerializedName("SUB_IMAGE")
    SUB_IMAGE("SUB_IMAGE"),
    
    @SerializedName("RESUB_DELTA")
    RESUB_DELTA("RESUB_DELTA"),
    
    @SerializedName("HEARTBEAT")
    HEARTBEAT("HEARTBEAT");

    private String value;

    CtEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ct")
  private CtEnum ct = null;

  @SerializedName("clk")
  private String clk = null;

  @SerializedName("heartbeatMs")
  private Long heartbeatMs = null;

  @SerializedName("pt")
  private Long pt = null;

  @SerializedName("initialClk")
  private String initialClk = null;

  @SerializedName("mc")
  private List<MarketChange> mc = new ArrayList<MarketChange>();

  @SerializedName("conflateMs")
  private Long conflateMs = null;

  /**
   * Segment Type - if the change is split into multiple segments, this denotes the beginning and end of a change, and segments in between. Will be null if data is not segmented
   */
  public enum SegmentTypeEnum {
    @SerializedName("SEG_START")
    SEG_START("SEG_START"),
    
    @SerializedName("SEG")
    SEG("SEG"),
    
    @SerializedName("SEG_END")
    SEG_END("SEG_END");

    private String value;

    SegmentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("segmentType")
  private SegmentTypeEnum segmentType = null;

  public MarketChangeMessage ct(CtEnum ct) {
    this.ct = ct;
    return this;
  }

   /**
   * Change Type - set to indicate the type of change - if null this is a delta)
   * @return ct
  **/
  @ApiModelProperty(example = "null", value = "Change Type - set to indicate the type of change - if null this is a delta)")
  public CtEnum getCt() {
    return ct;
  }

  public void setCt(CtEnum ct) {
    this.ct = ct;
  }

  public MarketChangeMessage clk(String clk) {
    this.clk = clk;
    return this;
  }

   /**
   * Token value (non-null) should be stored and passed in a MarketSubscriptionMessage to resume subscription (in case of disconnect)
   * @return clk
  **/
  @ApiModelProperty(example = "null", value = "Token value (non-null) should be stored and passed in a MarketSubscriptionMessage to resume subscription (in case of disconnect)")
  public String getClk() {
    return clk;
  }

  public void setClk(String clk) {
    this.clk = clk;
  }

  public MarketChangeMessage heartbeatMs(Long heartbeatMs) {
    this.heartbeatMs = heartbeatMs;
    return this;
  }

   /**
   * Heartbeat Milliseconds - the heartbeat rate (may differ from requested: bounds are 500 to 30000)
   * @return heartbeatMs
  **/
  @ApiModelProperty(example = "null", value = "Heartbeat Milliseconds - the heartbeat rate (may differ from requested: bounds are 500 to 30000)")
  public Long getHeartbeatMs() {
    return heartbeatMs;
  }

  public void setHeartbeatMs(Long heartbeatMs) {
    this.heartbeatMs = heartbeatMs;
  }

  public MarketChangeMessage pt(Long pt) {
    this.pt = pt;
    return this;
  }

   /**
   * Publish Time (in millis since epoch) that the changes were generated
   * @return pt
  **/
  @ApiModelProperty(example = "null", value = "Publish Time (in millis since epoch) that the changes were generated")
  public Long getPt() {
    return pt;
  }

  public void setPt(Long pt) {
    this.pt = pt;
  }

  public MarketChangeMessage initialClk(String initialClk) {
    this.initialClk = initialClk;
    return this;
  }

   /**
   * Token value (non-null) should be stored and passed in a MarketSubscriptionMessage to resume subscription (in case of disconnect)
   * @return initialClk
  **/
  @ApiModelProperty(example = "null", value = "Token value (non-null) should be stored and passed in a MarketSubscriptionMessage to resume subscription (in case of disconnect)")
  public String getInitialClk() {
    return initialClk;
  }

  public void setInitialClk(String initialClk) {
    this.initialClk = initialClk;
  }

  public MarketChangeMessage mc(List<MarketChange> mc) {
    this.mc = mc;
    return this;
  }

  public MarketChangeMessage addMcItem(MarketChange mcItem) {
    this.mc.add(mcItem);
    return this;
  }

   /**
   * MarketChanges - the modifications to markets (will be null on a heartbeat
   * @return mc
  **/
  @ApiModelProperty(example = "null", value = "MarketChanges - the modifications to markets (will be null on a heartbeat")
  public List<MarketChange> getMc() {
    return mc;
  }

  public void setMc(List<MarketChange> mc) {
    this.mc = mc;
  }

  public MarketChangeMessage conflateMs(Long conflateMs) {
    this.conflateMs = conflateMs;
    return this;
  }

   /**
   * Conflate Milliseconds - the conflation rate (may differ from that requested if subscription is delayed)
   * @return conflateMs
  **/
  @ApiModelProperty(example = "null", value = "Conflate Milliseconds - the conflation rate (may differ from that requested if subscription is delayed)")
  public Long getConflateMs() {
    return conflateMs;
  }

  public void setConflateMs(Long conflateMs) {
    this.conflateMs = conflateMs;
  }

  public MarketChangeMessage segmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
    return this;
  }

   /**
   * Segment Type - if the change is split into multiple segments, this denotes the beginning and end of a change, and segments in between. Will be null if data is not segmented
   * @return segmentType
  **/
  @ApiModelProperty(example = "null", value = "Segment Type - if the change is split into multiple segments, this denotes the beginning and end of a change, and segments in between. Will be null if data is not segmented")
  public SegmentTypeEnum getSegmentType() {
    return segmentType;
  }

  public void setSegmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketChangeMessage marketChangeMessage = (MarketChangeMessage) o;
    return Objects.equals(this.ct, marketChangeMessage.ct) &&
        Objects.equals(this.clk, marketChangeMessage.clk) &&
        Objects.equals(this.heartbeatMs, marketChangeMessage.heartbeatMs) &&
        Objects.equals(this.pt, marketChangeMessage.pt) &&
        Objects.equals(this.initialClk, marketChangeMessage.initialClk) &&
        Objects.equals(this.mc, marketChangeMessage.mc) &&
        Objects.equals(this.conflateMs, marketChangeMessage.conflateMs) &&
        Objects.equals(this.segmentType, marketChangeMessage.segmentType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ct, clk, heartbeatMs, pt, initialClk, mc, conflateMs, segmentType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketChangeMessage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ct: ").append(toIndentedString(ct)).append("\n");
    sb.append("    clk: ").append(toIndentedString(clk)).append("\n");
    sb.append("    heartbeatMs: ").append(toIndentedString(heartbeatMs)).append("\n");
    sb.append("    pt: ").append(toIndentedString(pt)).append("\n");
    sb.append("    initialClk: ").append(toIndentedString(initialClk)).append("\n");
    sb.append("    mc: ").append(toIndentedString(mc)).append("\n");
    sb.append("    conflateMs: ").append(toIndentedString(conflateMs)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
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

