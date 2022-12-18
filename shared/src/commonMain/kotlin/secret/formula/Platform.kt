package secret.formula

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform