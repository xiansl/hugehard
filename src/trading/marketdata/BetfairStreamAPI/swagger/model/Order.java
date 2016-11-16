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


/**
 * Order
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-15T22:47:57.805+11:00")
public class Order   {
  /**
   * Side - the side of the order
   */
  public enum SideEnum {
    @SerializedName("B")
    B("B"),
    
    @SerializedName("L")
    L("L");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("side")
  private SideEnum side = null;

  @SerializedName("sv")
  private Double sv = null;

  /**
   * Persistence Type - whether the order will persist at in play or not (L = LAPSE, P = PERSIST, MOC = Market On Close)
   */
  public enum PtEnum {
    @SerializedName("L")
    L("L"),
    
    @SerializedName("P")
    P("P"),
    
    @SerializedName("MOC")
    MOC("MOC");

    private String value;

    PtEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("pt")
  private PtEnum pt = null;

  /**
   * Order Type - the type of the order (L = LIMIT, MOC = MARKET_ON_CLOSE, LOC = LIMIT_ON_CLOSE)
   */
  public enum OtEnum {
    @SerializedName("L")
    L("L"),
    
    @SerializedName("LOC")
    LOC("LOC"),
    
    @SerializedName("MOC")
    MOC("MOC");

    private String value;

    OtEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ot")
  private OtEnum ot = null;

  @SerializedName("p")
  private Double p = null;

  @SerializedName("sc")
  private Double sc = null;

  @SerializedName("rc")
  private String rc = null;

  @SerializedName("s")
  private Double s = null;

  @SerializedName("pd")
  private Long pd = null;

  @SerializedName("rac")
  private String rac = null;

  @SerializedName("md")
  private Long md = null;

  @SerializedName("sl")
  private Double sl = null;

  @SerializedName("avp")
  private Double avp = null;

  @SerializedName("sm")
  private Double sm = null;

  @SerializedName("rfo")
  private String rfo = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("bsp")
  private Double bsp = null;

  @SerializedName("rfs")
  private String rfs = null;

  /**
   * Status - the status of the order (E = EXECUTABLE, EC = EXECUTION_COMPLETE)
   */
  public enum StatusEnum {
    @SerializedName("E")
    E("E"),
    
    @SerializedName("EC")
    EC("EC");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("sr")
  private Double sr = null;

  public Order side(SideEnum side) {
    this.side = side;
    return this;
  }

   /**
   * Side - the side of the order
   * @return side
  **/
  @ApiModelProperty(example = "null", value = "Side - the side of the order")
  public SideEnum getSide() {
    return side;
  }

  public void setSide(SideEnum side) {
    this.side = side;
  }

  public Order sv(Double sv) {
    this.sv = sv;
    return this;
  }

   /**
   * Size Voided - the amount of the order that has been voided
   * @return sv
  **/
  @ApiModelProperty(example = "null", value = "Size Voided - the amount of the order that has been voided")
  public Double getSv() {
    return sv;
  }

  public void setSv(Double sv) {
    this.sv = sv;
  }

  public Order pt(PtEnum pt) {
    this.pt = pt;
    return this;
  }

   /**
   * Persistence Type - whether the order will persist at in play or not (L = LAPSE, P = PERSIST, MOC = Market On Close)
   * @return pt
  **/
  @ApiModelProperty(example = "null", value = "Persistence Type - whether the order will persist at in play or not (L = LAPSE, P = PERSIST, MOC = Market On Close)")
  public PtEnum getPt() {
    return pt;
  }

  public void setPt(PtEnum pt) {
    this.pt = pt;
  }

  public Order ot(OtEnum ot) {
    this.ot = ot;
    return this;
  }

   /**
   * Order Type - the type of the order (L = LIMIT, MOC = MARKET_ON_CLOSE, LOC = LIMIT_ON_CLOSE)
   * @return ot
  **/
  @ApiModelProperty(example = "null", value = "Order Type - the type of the order (L = LIMIT, MOC = MARKET_ON_CLOSE, LOC = LIMIT_ON_CLOSE)")
  public OtEnum getOt() {
    return ot;
  }

  public void setOt(OtEnum ot) {
    this.ot = ot;
  }

  public Order p(Double p) {
    this.p = p;
    return this;
  }

   /**
   * Price - the original placed price of the order
   * @return p
  **/
  @ApiModelProperty(example = "null", value = "Price - the original placed price of the order")
  public Double getP() {
    return p;
  }

  public void setP(Double p) {
    this.p = p;
  }

  public Order sc(Double sc) {
    this.sc = sc;
    return this;
  }

   /**
   * Size Cancelled - the amount of the order that has been cancelled
   * @return sc
  **/
  @ApiModelProperty(example = "null", value = "Size Cancelled - the amount of the order that has been cancelled")
  public Double getSc() {
    return sc;
  }

  public void setSc(Double sc) {
    this.sc = sc;
  }

  public Order rc(String rc) {
    this.rc = rc;
    return this;
  }

   /**
   * Regulator Code - the regulator of the order
   * @return rc
  **/
  @ApiModelProperty(example = "null", value = "Regulator Code - the regulator of the order")
  public String getRc() {
    return rc;
  }

  public void setRc(String rc) {
    this.rc = rc;
  }

  public Order s(Double s) {
    this.s = s;
    return this;
  }

   /**
   * Size - the original placed size of the order
   * @return s
  **/
  @ApiModelProperty(example = "null", value = "Size - the original placed size of the order")
  public Double getS() {
    return s;
  }

  public void setS(Double s) {
    this.s = s;
  }

  public Order pd(Long pd) {
    this.pd = pd;
    return this;
  }

   /**
   * Placed Date - the date the order was placed
   * @return pd
  **/
  @ApiModelProperty(example = "null", value = "Placed Date - the date the order was placed")
  public Long getPd() {
    return pd;
  }

  public void setPd(Long pd) {
    this.pd = pd;
  }

  public Order rac(String rac) {
    this.rac = rac;
    return this;
  }

   /**
   * Regulator Auth Code - the auth code returned by the regulator
   * @return rac
  **/
  @ApiModelProperty(example = "null", value = "Regulator Auth Code - the auth code returned by the regulator")
  public String getRac() {
    return rac;
  }

  public void setRac(String rac) {
    this.rac = rac;
  }

  public Order md(Long md) {
    this.md = md;
    return this;
  }

   /**
   * Matched Date - the date the order was matched (null if the order is not matched)
   * @return md
  **/
  @ApiModelProperty(example = "null", value = "Matched Date - the date the order was matched (null if the order is not matched)")
  public Long getMd() {
    return md;
  }

  public void setMd(Long md) {
    this.md = md;
  }

  public Order sl(Double sl) {
    this.sl = sl;
    return this;
  }

   /**
   * Size Lapsed - the amount of the order that has been lapsed
   * @return sl
  **/
  @ApiModelProperty(example = "null", value = "Size Lapsed - the amount of the order that has been lapsed")
  public Double getSl() {
    return sl;
  }

  public void setSl(Double sl) {
    this.sl = sl;
  }

  public Order avp(Double avp) {
    this.avp = avp;
    return this;
  }

   /**
   * Average Price Matched - the average price the order was matched at (null if the order is not matched
   * @return avp
  **/
  @ApiModelProperty(example = "null", value = "Average Price Matched - the average price the order was matched at (null if the order is not matched")
  public Double getAvp() {
    return avp;
  }

  public void setAvp(Double avp) {
    this.avp = avp;
  }

  public Order sm(Double sm) {
    this.sm = sm;
    return this;
  }

   /**
   * Size Matched - the amount of the order that has been matched
   * @return sm
  **/
  @ApiModelProperty(example = "null", value = "Size Matched - the amount of the order that has been matched")
  public Double getSm() {
    return sm;
  }

  public void setSm(Double sm) {
    this.sm = sm;
  }

  public Order rfo(String rfo) {
    this.rfo = rfo;
    return this;
  }

   /**
   * Order Reference - the customer's order reference for this order (empty string if one was not set)
   * @return rfo
  **/
  @ApiModelProperty(example = "null", value = "Order Reference - the customer's order reference for this order (empty string if one was not set)")
  public String getRfo() {
    return rfo;
  }

  public void setRfo(String rfo) {
    this.rfo = rfo;
  }

  public Order id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Bet Id - the id of the order
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Bet Id - the id of the order")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order bsp(Double bsp) {
    this.bsp = bsp;
    return this;
  }

   /**
   * BSP Liability - the BSP liability of the order (null if the order is not a BSP order)
   * @return bsp
  **/
  @ApiModelProperty(example = "null", value = "BSP Liability - the BSP liability of the order (null if the order is not a BSP order)")
  public Double getBsp() {
    return bsp;
  }

  public void setBsp(Double bsp) {
    this.bsp = bsp;
  }

  public Order rfs(String rfs) {
    this.rfs = rfs;
    return this;
  }

   /**
   * Strategy Reference - the customer's strategy reference for this order (empty string if one was not set)
   * @return rfs
  **/
  @ApiModelProperty(example = "null", value = "Strategy Reference - the customer's strategy reference for this order (empty string if one was not set)")
  public String getRfs() {
    return rfs;
  }

  public void setRfs(String rfs) {
    this.rfs = rfs;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status - the status of the order (E = EXECUTABLE, EC = EXECUTION_COMPLETE)
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status - the status of the order (E = EXECUTABLE, EC = EXECUTION_COMPLETE)")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order sr(Double sr) {
    this.sr = sr;
    return this;
  }

   /**
   * Size Remaining - the amount of the order that is remaining unmatched
   * @return sr
  **/
  @ApiModelProperty(example = "null", value = "Size Remaining - the amount of the order that is remaining unmatched")
  public Double getSr() {
    return sr;
  }

  public void setSr(Double sr) {
    this.sr = sr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.side, order.side) &&
        Objects.equals(this.sv, order.sv) &&
        Objects.equals(this.pt, order.pt) &&
        Objects.equals(this.ot, order.ot) &&
        Objects.equals(this.p, order.p) &&
        Objects.equals(this.sc, order.sc) &&
        Objects.equals(this.rc, order.rc) &&
        Objects.equals(this.s, order.s) &&
        Objects.equals(this.pd, order.pd) &&
        Objects.equals(this.rac, order.rac) &&
        Objects.equals(this.md, order.md) &&
        Objects.equals(this.sl, order.sl) &&
        Objects.equals(this.avp, order.avp) &&
        Objects.equals(this.sm, order.sm) &&
        Objects.equals(this.rfo, order.rfo) &&
        Objects.equals(this.id, order.id) &&
        Objects.equals(this.bsp, order.bsp) &&
        Objects.equals(this.rfs, order.rfs) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.sr, order.sr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(side, sv, pt, ot, p, sc, rc, s, pd, rac, md, sl, avp, sm, rfo, id, bsp, rfs, status, sr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    sv: ").append(toIndentedString(sv)).append("\n");
    sb.append("    pt: ").append(toIndentedString(pt)).append("\n");
    sb.append("    ot: ").append(toIndentedString(ot)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    sc: ").append(toIndentedString(sc)).append("\n");
    sb.append("    rc: ").append(toIndentedString(rc)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    pd: ").append(toIndentedString(pd)).append("\n");
    sb.append("    rac: ").append(toIndentedString(rac)).append("\n");
    sb.append("    md: ").append(toIndentedString(md)).append("\n");
    sb.append("    sl: ").append(toIndentedString(sl)).append("\n");
    sb.append("    avp: ").append(toIndentedString(avp)).append("\n");
    sb.append("    sm: ").append(toIndentedString(sm)).append("\n");
    sb.append("    rfo: ").append(toIndentedString(rfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bsp: ").append(toIndentedString(bsp)).append("\n");
    sb.append("    rfs: ").append(toIndentedString(rfs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sr: ").append(toIndentedString(sr)).append("\n");
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

