package com.example.plugins

import com.example.data.DataRepository
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/about") {
            val sampleUser = DataRepository().getUsersData(1)
            call.respond(FreeMarkerContent("about.ftl", mapOf("user" to sampleUser)))
        }
    }
}
