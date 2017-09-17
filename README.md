# SpringSecurityOAuth

http://localhost:8080/SpringSecurityOAuth/oauth/token?grant_type=password&client_id=fbApp&client_secret=fbApp&username=admin&password=123

## Output:

http://localhost:8080/SpringSecurityOAuth/oauth/token?grant_type=password&client_id=fbApp&client_secret=fbApp&username=admin&password=123

```
{  
    "access_token":"5f456b32-a52b-4121-858e-066083f5138b",
    "token_type":"bearer",
    "refresh_token":"fc348b4f-de62-4523-b808-9935b1f2e46f",
    "expires_in":119
}
```

http://localhost:8080/SpringSecurityOAuth/api/admin?access_token=5f456b32-a52b-4121-858e-066083f5138b

If token expired -

http://localhost:8080/SpringSecurityOAuth/oauth/token?grant_type=refresh_token&client_id=restapp&client_secret=restapp&refresh_token=fc348b4f-de62-4523-b808-9935b1f2e46f 
