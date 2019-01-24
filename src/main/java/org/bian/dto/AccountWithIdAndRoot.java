package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AccountWithIdAndRoot
 */
public class AccountWithIdAndRoot   {
  private String networkParticipantFacilityAccountAccessReference = null;

  private String productInstanceReference = null;

  private String networkParticipantFacilityAccountReference = null;

  private String networkParticipantFacilityAccountPostingPurpose = null;

  private String networkParticipantFacilityAccountPostingAmount = null;

  private String networkParticipantFacilityAccountPostingValueDate = null;

  private String networkParticipantFacilityAccountPostingResult = null;

  private Object networkParticipantFacilityAccountAccessRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return networkParticipantFacilityAccountAccessReference
  **/

  public String getNetworkParticipantFacilityAccountAccessReference() {
    return networkParticipantFacilityAccountAccessReference;
  }

  public void setNetworkParticipantFacilityAccountAccessReference(String networkParticipantFacilityAccountAccessReference) {
    this.networkParticipantFacilityAccountAccessReference = networkParticipantFacilityAccountAccessReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return networkParticipantFacilityAccountReference
  **/

  public String getNetworkParticipantFacilityAccountReference() {
    return networkParticipantFacilityAccountReference;
  }

  public void setNetworkParticipantFacilityAccountReference(String networkParticipantFacilityAccountReference) {
    this.networkParticipantFacilityAccountReference = networkParticipantFacilityAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return networkParticipantFacilityAccountPostingPurpose
  **/

  public String getNetworkParticipantFacilityAccountPostingPurpose() {
    return networkParticipantFacilityAccountPostingPurpose;
  }

  public void setNetworkParticipantFacilityAccountPostingPurpose(String networkParticipantFacilityAccountPostingPurpose) {
    this.networkParticipantFacilityAccountPostingPurpose = networkParticipantFacilityAccountPostingPurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return networkParticipantFacilityAccountPostingAmount
  **/

  public String getNetworkParticipantFacilityAccountPostingAmount() {
    return networkParticipantFacilityAccountPostingAmount;
  }

  public void setNetworkParticipantFacilityAccountPostingAmount(String networkParticipantFacilityAccountPostingAmount) {
    this.networkParticipantFacilityAccountPostingAmount = networkParticipantFacilityAccountPostingAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date       
   * @return networkParticipantFacilityAccountPostingValueDate
  **/

  public String getNetworkParticipantFacilityAccountPostingValueDate() {
    return networkParticipantFacilityAccountPostingValueDate;
  }

  public void setNetworkParticipantFacilityAccountPostingValueDate(String networkParticipantFacilityAccountPostingValueDate) {
    this.networkParticipantFacilityAccountPostingValueDate = networkParticipantFacilityAccountPostingValueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text       
   * @return networkParticipantFacilityAccountPostingResult
  **/

  public String getNetworkParticipantFacilityAccountPostingResult() {
    return networkParticipantFacilityAccountPostingResult;
  }

  public void setNetworkParticipantFacilityAccountPostingResult(String networkParticipantFacilityAccountPostingResult) {
    this.networkParticipantFacilityAccountPostingResult = networkParticipantFacilityAccountPostingResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary      
   * @return networkParticipantFacilityAccountAccessRecord
  **/

  public Object getNetworkParticipantFacilityAccountAccessRecord() {
    return networkParticipantFacilityAccountAccessRecord;
  }

  public void setNetworkParticipantFacilityAccountAccessRecord(Object networkParticipantFacilityAccountAccessRecord) {
    this.networkParticipantFacilityAccountAccessRecord = networkParticipantFacilityAccountAccessRecord;
  }


}

