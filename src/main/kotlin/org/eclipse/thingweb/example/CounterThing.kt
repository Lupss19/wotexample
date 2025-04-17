package org.eclipse.thingweb.example

import org.eclipse.thingweb.reflection.annotations.Action
import org.eclipse.thingweb.reflection.annotations.Property
import org.eclipse.thingweb.reflection.annotations.Thing
import org.springframework.stereotype.Component

@Thing(
    id = "counter",
    title = "Counter Thing",
    description = "A simple Counter"
)

@Component
class CounterThing {
    @Property(title = "counter", readOnly = true)
    var counter: Int = 0

    @Action(title= "Increase Counter", description = "Increase counter by 1")
    suspend fun count() {
        counter++
    }
}