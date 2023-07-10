package com.itis.stock_app.notes

import io.realm.RealmObject

open class Note : RealmObject() {
    var title: String? = null
    var description: String? = null
    var createdTime: Long? = null
}