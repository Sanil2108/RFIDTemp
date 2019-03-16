package com.sanilk.rfidtemp3;

import com.sanilk.rfidtemp3.models.RFIDData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Service {

    @Autowired
    private RFIDDataRepository rfidDataRepository;

    public InsertDataResponse insertData(InsertDataRequest insertDataRequest){
        RFIDData rfidData = new RFIDData();

        InsertDataResponse insertDataResponse = new InsertDataResponse();

        if(!insertDataRequest.getData().equals("") && insertDataRequest.getData() != null) {
            rfidData.setData(insertDataRequest.getData());
            rfidData.setDate(insertDataRequest.getDate());

            rfidDataRepository.save(rfidData);

            insertDataResponse.setId(rfidData.getId());
            insertDataResponse.setStatus("Successful!");
        }else{
            insertDataResponse.setStatus("Data seems to be empty. Failed.");
        }

        return insertDataResponse;
    }

}
