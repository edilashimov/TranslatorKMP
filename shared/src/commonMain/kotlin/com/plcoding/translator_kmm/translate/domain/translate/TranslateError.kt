enum class TranslateError {
    SERVICE_UNAVAILABLE,
    CLIENT_REQUEST,
    SERVER_ERROR,
    UNKNOWN_ERROR
}

class TranslateException(val error: TranslateError) : Exception(
    "An error occurred when translating: $error"
)