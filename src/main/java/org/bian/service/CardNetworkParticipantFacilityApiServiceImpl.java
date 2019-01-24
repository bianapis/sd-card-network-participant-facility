/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardNetworkParticipantFacilityApiServiceImpl implements CardNetworkParticipantFacilityApiService {

	public NetworkParticipantWithRoot executePost(NetworkParticipant request){
		return JsonReader.read("executePost-NetworkParticipantWithRoot.json",new TypeReference<NetworkParticipantWithRoot>(){});
	}
	
	public NetworkParticipantWithRoot executePut(String crReferenceId, NetworkParticipant request){
		return JsonReader.read("executePut-NetworkParticipantWithRoot.json",new TypeReference<NetworkParticipantWithRoot>(){});
	}
	
	public NetworkParticipantWithRoot initiate(NetworkParticipant request){
		return JsonReader.read("initiate-NetworkParticipantWithRoot.json",new TypeReference<NetworkParticipantWithRoot>(){});
	}
	
	public RecordResponse record(String crReferenceId, RecordRequest request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public AccountWithIdAndRoot retrieveAccounts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AccountWithIdAndRoot.json",new TypeReference<AccountWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public NetworkParticipantWithRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-NetworkParticipantWithRoot.json",new TypeReference<NetworkParticipantWithRoot>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public FacilityTermsWithIdAndRoot retrieveFacilityTerms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FacilityTermsWithIdAndRoot.json",new TypeReference<FacilityTermsWithIdAndRoot>(){});
	}
	
	public ServiceWithIdAndRoot retrieveServices(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ServiceWithIdAndRoot.json",new TypeReference<ServiceWithIdAndRoot>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public NetworkParticipantWithRoot update(String crReferenceId, NetworkParticipant request){
		return JsonReader.read("update-NetworkParticipantWithRoot.json",new TypeReference<NetworkParticipantWithRoot>(){});
	}
	
	public ServiceWithIdAndRoot requestPostServices(String crReferenceId, org.bian.dto.Service request){
		return JsonReader.read("requestPost-ServiceWithIdAndRoot.json",new TypeReference<ServiceWithIdAndRoot>(){});
	}
	
	public ServiceWithIdAndRoot requestPutServices(String crReferenceId, String bqReferenceId, org.bian.dto.Service request){
		return JsonReader.read("requestPut-ServiceWithIdAndRoot.json",new TypeReference<ServiceWithIdAndRoot>(){});
	}
	
}
