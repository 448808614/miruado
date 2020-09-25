package com.ooooonly.miruado

import com.ooooonly.miruado.verticals.WebControllerVertical
import io.vertx.core.Vertx
import io.vertx.kotlin.core.deployVerticleAwait

class MainWebServer {
    val vertx: Vertx by lazy{
        Vertx.vertx()
    }
    suspend fun start(){
        vertx.deployVerticleAwait(WebControllerVertical(globalConfig.getInteger("port"),true))
    }
    fun stop(){
        vertx.close()
    }
}