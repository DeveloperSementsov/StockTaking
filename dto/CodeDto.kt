/**
 * Параметры ответа
 *
 * @param cis КИ / КиЗ из запроса
 * @param valid Результат проверки валидности структуры КИ / КиЗ
 * @param verified Результат проверки крипто- подписи КИ
 * @param realizable Признак возможности реализации КИ / КиЗ
 * @param utilised Признак нанесения КИ / КиЗ на упаковку. true — КИ / КиЗ нанесён
 * @param sold Признак продажи товара. true - продан
 * @param isBloсked Признак заблокированного КМ. true - КМ заблокирован
 * @param found Признак наличия КМ в ГИС МТ. true - КМ найден
 * @param printView КИ без крипто- подписи / КиЗ
 * @param productionDate Дата производства продукции. Формат yyyy-MM-dd’T’HH:mm:ss.SSSz
 * @param expireDate Дата и время истечения срока годности. Формат yyyy-MM-dd’T’HH:mm:ss.SSSz
 * @param gtin Код товара
 * @param errorCode Код ошибки
 * @param message Сообщение об ошибке
 */

data class CodeDto(
    val cis: String,
    val valid: Boolean,
    val verified: Boolean,
    val realizable: Boolean,
    val utilised: Boolean,
    val sold: Boolean,
    val isBloсked: Boolean,
    val found: Boolean,
    val productionDate: String?,
    val expireDate: String?,
    val gtin: String,
    val errorCode: Int?,
    val message: String?,
)

/**
 * Возможные значения кодов ошибки:
 *
 * 0 — ошибки отсутствуют;
 * 1 — «Ошибка валидации КМ»;
 * 2 — «КМ не содержит GTIN»;
 * 3 — «КМ не содержит серийный номер»;
 * 4 — «КМ содержит недопустимые символы»;
 * 5 — «Ошибка верификации крипто- подписи КМ (формат крипто-подписи не соответствует типу КМ)»;
 * 6 — «Ошибка верификации крипто- подписи КМ (крипто-подпись не валидная)»;
 * 7 — «Ошибка верификации крипто- подписи КМ (крипто-ключ не валиден)»;
 * 8 — «КМ не прошел верификацию в стране эмитента;
 * 9 — «Найденные AI в КМ не поддерживаются»;
 * 10 — «КМ не найден в ГИС МТ»
 */