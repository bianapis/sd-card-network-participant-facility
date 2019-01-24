/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardNetworkParticipantFacilityApiService {

	NetworkParticipantWithRoot executePost(NetworkParticipant request);
	
	NetworkParticipantWithRoot executePut(String crReferenceId, NetworkParticipant request);
	
	NetworkParticipantWithRoot initiate(NetworkParticipant request);
	
	RecordResponse record(String crReferenceId, RecordRequest request);
	
	ServiceWithIdAndRoot requestPostServices(String crReferenceId, Service request);
	
	ServiceWithIdAndRoot requestPutServices(String crReferenceId, String bqReferenceId, Service request);
	
	AccountWithIdAndRoot retrieveAccounts(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	NetworkParticipantWithRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	FacilityTermsWithIdAndRoot retrieveFacilityTerms(String crReferenceId, String bqReferenceId);
	
	ServiceWithIdAndRoot retrieveServices(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	NetworkParticipantWithRoot update(String crReferenceId, NetworkParticipant request);
	
}
