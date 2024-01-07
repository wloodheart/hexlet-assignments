@import exercise.dto.users.UsersPage
@param UsersPage page

<html>
<head>
    <title>USERS</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>${page.header()}</h1>
@if(page.USERS().isEmpty())
    <p>Пока не добавлено ни одного пользователя</p>
@else
    @for(var user : page.USERS())
        <div>
            <h2><a href="/users/${user.getId()}">${user.getFirstName()} ${user.getLastName()}</a></h2>
        </div>
    @endfor
@endif
</body>
</html>