package com.bluetoothcontrol.client;

import com.bluetoothcontrol.clidata.testdata;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Mqttclient {
/*
/*
   public static  String publisherId = UUID.randomUUID().toString();
   public static  IMqttClient publisher;

    static {
        try {
            publisher = new MqttClient("tcp://iot.eclipse.org:1883", publisherId);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public static void Mqttclient() throws MqttException, InterruptedException {

        MqttConnectOptions options = new MqttConnectOptions();
        options.setAutomaticReconnect(true);
        options.setCleanSession(true);
        options.setConnectionTimeout(10);
        publisher.connect(options);

        System.out.println(options);

        /*
        CountDownLatch receivedSignal = new CountDownLatch(10);
        publisher.subscribe(testdata.TOPIC, (topic, msg) -> {
            byte[] payload = msg.getPayload();
            // ... payload handling omitted
            receivedSignal.countDown();
        });
        receivedSignal.await(1, TimeUnit.MINUTES);

        if (publisher.isConnected()) {
            System.out.println("Connected");

        }*/

}
