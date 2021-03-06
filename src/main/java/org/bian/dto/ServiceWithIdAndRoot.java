package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ServiceWithIdAndRoot
 */
public class ServiceWithIdAndRoot   {
  private String networkParticipantNetworkServiceRequestReference = null;

  private String productInstanceReference = null;

  private String networkParticipantServiceType = null;

  private String networkParticipantServiceCharge = null;

  private String networkParticipantServiceDateTime = null;

  private Object networkParticipantServiceRecord = null;

  private Object networkParticipantNetworkServiceRequestRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return networkParticipantNetworkServiceRequestReference
  **/

  public String getNetworkParticipantNetworkServiceRequestReference() {
    return networkParticipantNetworkServiceRequestReference;
  }

  public void setNetworkParticipantNetworkServiceRequestReference(String networkParticipantNetworkServiceRequestReference) {
    this.networkParticipantNetworkServiceRequestReference = networkParticipantNetworkServiceRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return networkParticipantServiceType
  **/

  public String getNetworkParticipantServiceType() {
    return networkParticipantServiceType;
  }

  public void setNetworkParticipantServiceType(String networkParticipantServiceType) {
    this.networkParticipantServiceType = networkParticipantServiceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return networkParticipantServiceCharge
  **/

  public String getNetworkParticipantServiceCharge() {
    return networkParticipantServiceCharge;
  }

  public void setNetworkParticipantServiceCharge(String networkParticipantServiceCharge) {
    this.networkParticipantServiceCharge = networkParticipantServiceCharge;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return networkParticipantServiceDateTime
  **/

  public String getNetworkParticipantServiceDateTime() {
    return networkParticipantServiceDateTime;
  }

  public void setNetworkParticipantServiceDateTime(String networkParticipantServiceDateTime) {
    this.networkParticipantServiceDateTime = networkParticipantServiceDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return networkParticipantServiceRecord
  **/

  public Object getNetworkParticipantServiceRecord() {
    return networkParticipantServiceRecord;
  }

  public void setNetworkParticipantServiceRecord(Object networkParticipantServiceRecord) {
    this.networkParticipantServiceRecord = networkParticipantServiceRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return networkParticipantNetworkServiceRequestRecord
  **/

  public Object getNetworkParticipantNetworkServiceRequestRecord() {
    return networkParticipantNetworkServiceRequestRecord;
  }

  public void setNetworkParticipantNetworkServiceRequestRecord(Object networkParticipantNetworkServiceRequestRecord) {
    this.networkParticipantNetworkServiceRequestRecord = networkParticipantNetworkServiceRequestRecord;
  }


}

