package com.test

import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx
import io.vertx.ext.apex.Router

class HelloWorldVerticle: AbstractVerticle() {

    override fun start() {
        val router = router(vertx)

        router.route().handler({ routingContext ->
            routingContext.response().putHeader("content-type", "text/html").end("Hello Apex Kotlin World!")
        })

        vertx.createHttpServer().requestHandler({request -> router.accept(request)}).listen(8080);

    }
}

fun router(vertx: Vertx): Router = Router.router(vertx)