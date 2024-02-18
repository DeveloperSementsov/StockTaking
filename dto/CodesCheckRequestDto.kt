/**
 * Запрос верификации кодов маркировки и получения сокращённой информации о товаре
 *
 * @param codes Список КИ / КиЗ
 * @param inn ИНН предполагаемого владельца кода
 */
data class CodesCheckRequestDto(
    val codes: List<String>,
    val inn: String? = null
)