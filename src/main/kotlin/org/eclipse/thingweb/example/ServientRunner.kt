package org.eclipse.thingweb.example

import jakarta.annotation.PostConstruct
// ??
import org.eclipse.thingweb.reflection.ThingReflectionServient
import org.eclipse.thingweb.Servient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.context.ApplicationContext

@Component
class ServientRunner (
    @Autowired private val context: ApplicationContext
) {

    @PostConstruct
    val config = Launcher.loadDefaultConfig()
    val baseServient: Servient = DefaultServient(config)
    val reflectionServient = ThingReflectionServient(baseServient, context)
    reflectionServient.start()
}