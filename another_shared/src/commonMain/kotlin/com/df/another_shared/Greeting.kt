package com.df.another_shared

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}