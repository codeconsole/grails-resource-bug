package resource.bug

import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import grails.core.GrailsApplication

class BootStrap {

    GrailsApplication grailsApplication

    def init = { servletContext ->
        println "This only fails on latest snapshot..."
        new PathMatchingResourcePatternResolver(grailsApplication.classLoader).getResources("classpath*:messages_*.properties")
    }
    def destroy = {
    }
}