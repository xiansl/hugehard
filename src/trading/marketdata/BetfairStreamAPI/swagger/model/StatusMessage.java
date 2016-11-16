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
import io.swagger.client.model.ResponseMessage;


/**
 * StatusMessage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-15T22:47:57.805+11:00")
public class StatusMessage extends ResponseMessage  {
  @SerializedName("errorMessage")
  private String errorMessage = null;

  /**
   * The type of error in case of a failure
   */
  public enum ErrorCodeEnum {
    @SerializedName("NO_APP_KEY")
    NO_APP_KEY("NO_APP_KEY"),
    
    @SerializedName("INVALID_APP_KEY")
    INVALID_APP_KEY("INVALID_APP_KEY"),
    
    @SerializedName("NO_SESSION")
    NO_SESSION("NO_SESSION"),
    
    @SerializedName("INVALID_SESSION_INFORMATION")
    INVALID_SESSION_INFORMATION("INVALID_SESSION_INFORMATION"),
    
    @SerializedName("NOT_AUTHORIZED")
    NOT_AUTHORIZED("NOT_AUTHORIZED"),
    
    @SerializedName("INVALID_INPUT")
    INVALID_INPUT("INVALID_INPUT"),
    
    @SerializedName("INVALID_CLOCK")
    INVALID_CLOCK("INVALID_CLOCK"),
    
    @SerializedName("UNEXPECTED_ERROR")
    UNEXPECTED_ERROR("UNEXPECTED_ERROR"),
    
    @SerializedName("TIMEOUT")
    TIMEOUT("TIMEOUT"),
    
    @SerializedName("SUBSCRIPTION_LIMIT_EXCEEDED")
    SUBSCRIPTION_LIMIT_EXCEEDED("SUBSCRIPTION_LIMIT_EXCEEDED"),
    
    @SerializedName("INVALID_REQUEST")
    INVALID_REQUEST("INVALID_REQUEST"),
    
    @SerializedName("CONNECTION_FAILED")
    CONNECTION_FAILED("CONNECTION_FAILED"),
    
    @SerializedName("MAX_CONNECTION_LIMIT_EXCEEDED")
    MAX_CONNECTION_LIMIT_EXCEEDED("MAX_CONNECTION_LIMIT_EXCEEDED");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("errorCode")
  private ErrorCodeEnum errorCode = null;

  @SerializedName("connectionId")
  private String connectionId = null;

  @SerializedName("connectionClosed")
  private Boolean connectionClosed = null;

  /**
   * The status of the last request
   */
  public enum StatusCodeEnum {
    @SerializedName("SUCCESS")
    SUCCESS("SUCCESS"),
    
    @SerializedName("FAILURE")
    FAILURE("FAILURE");

    private String value;

    StatusCodeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("statusCode")
  private StatusCodeEnum statusCode = null;

  public StatusMessage errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Additional message in case of a failure
   * @return errorMessage
  **/
  @ApiModelProperty(example = "null", value = "Additional message in case of a failure")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public StatusMessage errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The type of error in case of a failure
   * @return errorCode
  **/
  @ApiModelProperty(example = "null", value = "The type of error in case of a failure")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }

  public StatusMessage connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The connection id
   * @return connectionId
  **/
  @ApiModelProperty(example = "null", value = "The connection id")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public StatusMessage connectionClosed(Boolean connectionClosed) {
    this.connectionClosed = connectionClosed;
    return this;
  }

   /**
   * Is the connection now closed
   * @return connectionClosed
  **/
  @ApiModelProperty(example = "null", value = "Is the connection now closed")
  public Boolean getConnectionClosed() {
    return connectionClosed;
  }

  public void setConnectionClosed(Boolean connectionClosed) {
    this.connectionClosed = connectionClosed;
  }

  public StatusMessage statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * The status of the last request
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "The status of the last request")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusMessage statusMessage = (StatusMessage) o;
    return Objects.equals(this.errorMessage, statusMessage.errorMessage) &&
        Objects.equals(this.errorCode, statusMessage.errorCode) &&
        Objects.equals(this.connectionId, statusMessage.connectionId) &&
        Objects.equals(this.connectionClosed, statusMessage.connectionClosed) &&
        Objects.equals(this.statusCode, statusMessage.statusCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorCode, connectionId, connectionClosed, statusCode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusMessage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    connectionClosed: ").append(toIndentedString(connectionClosed)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

