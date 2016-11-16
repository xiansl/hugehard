package trading.marketdata.BetfairStreamAPI.swagger.model;

import java.util.Objects;

/**
 * RequestMessage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-15T22:47:57.805+11:00")
public class RequestMessage   {
  @SerializedName("op")
  private String op = null;

  @SerializedName("id")
  private Integer id = null;

  public RequestMessage op(String op) {
    this.op = op;
    return this;
  }

   /**
   * The operation type
   * @return op
  **/
  @ApiModelProperty(example = "null", value = "The operation type")
  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public RequestMessage id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Client generated unique id to link request with response (like json rpc)
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Client generated unique id to link request with response (like json rpc)")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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
    RequestMessage requestMessage = (RequestMessage) o;
    return Objects.equals(this.op, requestMessage.op) &&
        Objects.equals(this.id, requestMessage.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestMessage {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
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

