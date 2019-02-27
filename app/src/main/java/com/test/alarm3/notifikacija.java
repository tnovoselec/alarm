package com.test.alarm3;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.test.alarm3.App.CHANNEL_1_ID;

public class notifikacija extends AppCompatActivity {


    public void sendNotification() {


        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this, CHANNEL_1_ID)
                        .setSmallIcon(R.drawable.ic_android)
                        .setContentTitle("Naslov")
                        .setContentText("Neki text....")
                        .setPriority(NotificationCompat.PRIORITY_HIGH);



        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);


        mNotificationManager.notify(1, mBuilder.build());
    }

}
