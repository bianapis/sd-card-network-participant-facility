package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FacilityTermsWithIdAndRoot
 */
public class FacilityTermsWithIdAndRoot   {
  private String networkParticipantFacilityTermsReference = null;

  private String productInstanceReference = null;

  private String participantAcquirerBankReference = null;

  private String participantAcquirerBankClearingAndSettlementTerms = null;

  private String participantAcquirerBankServiceSchedule = null;

  private String participantIssuerBankReference = null;

  private String participantIssuerBankClearingAndSettlementTerms = null;

  private String participantIssuerBankServiceSchedule = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return networkParticipantFacilityTermsReference
  **/

  public String getNetworkParticipantFacilityTermsReference() {
    return networkParticipantFacilityTermsReference;
  }

  public void setNetworkParticipantFacilityTermsReference(String networkParticipantFacilityTermsReference) {
    this.networkParticipantFacilityTermsReference = networkParticipantFacilityTermsReference;
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
   * @return participantAcquirerBankReference
  **/

  public String getParticipantAcquirerBankReference() {
    return participantAcquirerBankReference;
  }

  public void setParticipantAcquirerBankReference(String participantAcquirerBankReference) {
    this.participantAcquirerBankReference = participantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return participantAcquirerBankClearingAndSettlementTerms
  **/

  public String getParticipantAcquirerBankClearingAndSettlementTerms() {
    return participantAcquirerBankClearingAndSettlementTerms;
  }

  public void setParticipantAcquirerBankClearingAndSettlementTerms(String participantAcquirerBankClearingAndSettlementTerms) {
    this.participantAcquirerBankClearingAndSettlementTerms = participantAcquirerBankClearingAndSettlementTerms;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return participantAcquirerBankServiceSchedule
  **/

  public String getParticipantAcquirerBankServiceSchedule() {
    return participantAcquirerBankServiceSchedule;
  }

  public void setParticipantAcquirerBankServiceSchedule(String participantAcquirerBankServiceSchedule) {
    this.participantAcquirerBankServiceSchedule = participantAcquirerBankServiceSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return participantIssuerBankClearingAndSettlementTerms
  **/

  public String getParticipantIssuerBankClearingAndSettlementTerms() {
    return participantIssuerBankClearingAndSettlementTerms;
  }

  public void setParticipantIssuerBankClearingAndSettlementTerms(String participantIssuerBankClearingAndSettlementTerms) {
    this.participantIssuerBankClearingAndSettlementTerms = participantIssuerBankClearingAndSettlementTerms;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text       
   * @return participantIssuerBankServiceSchedule
  **/

  public String getParticipantIssuerBankServiceSchedule() {
    return participantIssuerBankServiceSchedule;
  }

  public void setParticipantIssuerBankServiceSchedule(String participantIssuerBankServiceSchedule) {
    this.participantIssuerBankServiceSchedule = participantIssuerBankServiceSchedule;
  }


}

