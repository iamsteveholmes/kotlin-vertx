package com.test

import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx

class HelloWorldVerticle : AbstractVerticle() {

    override fun start() {
        Vertx.vertx().createHttpServer().requestHandler({request -> request.response().end("Hello Kotlin World!")}).listen(8080);
    }
}