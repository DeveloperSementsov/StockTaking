/**
 * Параметры ответа
 *
 * @param code Результат обработки операции
 * @param description Текстовое описание результата выполнения метода
 * @param codes Список КИ / КиЗ
 * @param reqId Уникальный идентификатор запроса
 * @param reqTimestamp Дата и время формирования запроса
 */

data class CodesCheckResponseDto(
    val code: Int,
    val codes: List<Code>,
    val description: String,
    val reqId: String,
    val reqTimestamp: Long
)