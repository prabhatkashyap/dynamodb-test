package com.dynamodb

class ProfileController {

    def index() {
//        session.invalidate()
        println("session::" + session.getId())
        render(view: "/index")
    }
}
