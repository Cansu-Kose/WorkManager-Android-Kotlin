package com.example.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class LogWorker(appContext:Context,workerParameters: WorkerParameters)
    :Worker(appContext,workerParameters) {


    override fun doWork(): Result {
        Log.v("Cansu","Worker Called")
        return Result.success()
    }
}