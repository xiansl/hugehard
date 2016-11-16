package trading.marketdata.BetfairStreamAPI.swagger.model;

import java.util.Objects;

/**
 * ConnectionMessage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-15T22:47:57.805+11:00")
public class ConnectionMessage extends ResponseMessage  {
  private String connectionId = null;

  public ConnectionMessage connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The connection id
   * @return connectionId
  **/
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionMessage connectionMessage = (ConnectionMessage) o;
    return Objects.equals(this.connectionId, connectionMessage.connectionId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionMessage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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

