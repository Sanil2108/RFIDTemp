package com.sanilk.rfidtemp3;

import com.sanilk.rfidtemp3.models.RFIDData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Service {

    @Autowired
    private RFIDDataRepository rfidDataRepository;

    public InsertDataResponse insertData(InsertDataRequest insertDataRequest){
        RFIDData rfidData = new RFIDData();
        rfidData.setData(insertDataRequest.getData());
        rfidData.setDate(insertDataRequest.getDate());
        InsertDataResponse insertDataResponse = new InsertDataResponse();

        rfidDataRepository.save(rfidData);

        insertDataResponse.setId(rfidData.getId());
        insertDataResponse.setStatus("Successful!");

        return insertDataResponse;
    }

}
