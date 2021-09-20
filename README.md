# QualityExpertMakarov4
Запустить ZaglushApplication.java
Открыть Postman: Post методом на  http://localhost:8080/message, выбрав в Headers Content-Type application/json, выбрав raw, в Body добавить Json формата
{
    "id": 1212,   -- это пример( поменяй на любой int)
    "text": "Волки", -- любой String
    "text2": "Медведи"  -- любой String
}
Нажать Enter, получить ответ аналогичный Json, тому, что мы отправили! ( можно изменить любой параметр респонса, на заранее выбранный, поменяв в коде строчку)
----------------
если нет Postman, открыть панель разработчика в браузере http://localhost:8080/message, нажав F12.
fetch('/message',{method:'POST', headers: {'Content-Type':'application/json'}, body: JSON.stringify({
    "id": 1212,
    "text": "Лисы",
    "text2": "Медведи"
})}).then(console.log)
