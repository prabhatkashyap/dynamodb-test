includeTargets << grailsScript("_GrailsInit")
includeTargets << grailsScript("_GrailsCompile")

eventCompileStart = {
    ant.delete(file: "${basedir}/web-app/META-INF/*.xml")

//    if (grails.util.Environment.current.name == "production") {
    println("*********=========== Session Script ============************")
    println("*********===========basedir ============****${basedir}********")
        ant.copy(tofile: "${basedir}/web-app/META-INF/context.xml") {
            fileset(file: "${basedir}/context-prod.xml")
        }
//    }
}