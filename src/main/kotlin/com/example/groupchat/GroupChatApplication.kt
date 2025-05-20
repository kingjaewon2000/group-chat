package com.example.groupchat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GroupChatApplication

fun main(args: Array<String>) {
    runApplication<GroupChatApplication>(*args)
}
