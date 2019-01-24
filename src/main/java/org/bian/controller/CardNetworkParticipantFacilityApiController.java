/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CardNetworkParticipantFacilityApiController {

	@Autowired
	CardNetworkParticipantFacilityApiService service;
	
	@Fulfill.ExecutePost
	public BianResponse<NetworkParticipantWithRoot> executePost(@RequestBody BianRequest<NetworkParticipant> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Fulfill.ExecutePut
	public BianResponse<NetworkParticipantWithRoot> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<NetworkParticipant> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<NetworkParticipantWithRoot> initiate(@RequestBody BianRequest<NetworkParticipant> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<RecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("services")
	@Fulfill.RequestPost
	public BianResponse<ServiceWithIdAndRoot> requestPostServices(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Service> bianRequest) {
		return BianResponse.forSuccess(service.requestPostServices(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("services")
	@Fulfill.RequestPut
	public BianResponse<ServiceWithIdAndRoot> requestPutServices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Service> bianRequest) {
		return BianResponse.forSuccess(service.requestPutServices(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("accounts")
	@Fulfill.Retrieve
	public BianResponse<AccountWithIdAndRoot> retrieveAccounts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAccounts(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Fulfill.Retrieve
	public BianResponse<NetworkParticipantWithRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("facility-terms")
	@Fulfill.Retrieve
	public BianResponse<FacilityTermsWithIdAndRoot> retrieveFacilityTerms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFacilityTerms(crReferenceId, bqReferenceId));
	}
	
	@BQ("services")
	@Fulfill.Retrieve
	public BianResponse<ServiceWithIdAndRoot> retrieveServices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServices(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<NetworkParticipantWithRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<NetworkParticipant> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
