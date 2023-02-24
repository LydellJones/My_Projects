var express = require('express');  
var app = express();  
var songs = ["My Way", "Body and Soul", "Dream", "Let's Fall In Love", "Young At Heart", "All the Way", "Autumn Leaves",
                "Witchcraft", "Only The Lonely", "The Last Dance", "If I Had You", "Poinciana", "High Hopes", "April in Paris",
                    "Ring a Ding Ding", "All Of Me", "A Foggy Day", "A Fine Romance", "There's no You", "Laura"]

function randomNumber(min, max) { 
    return Math.random() * (max - min) + min;
} 

app.get('/', function (req, res) {  
    res.send(songs[randomnumber(0,19)]);  
});
app.get('/birth_date', function (req, res){
    res.send('December 12, 1915')
});
app.get('/wives', function (req, res){
    res.send('Nancy Barbato, Ava Gardner, Mia Farrow, Barbara Sinatra')
});
app.get('/birth_city', function (req, res){
    res.send('Hoboken, NJ')
});
app.get('/picture', function (req, res){
    res.redirect('https://upload.wikimedia.org/wikipedia/commons/a/af/Frank_Sinatra_%2757.jpg')
})
app.get('/public', function (req, res){
    res.send('Everybody can see this page')
});
app.get('/private', function (req, res) {

  if (  req.headers.authorization !== 'Basic eW91cmxvZ2luOnlvdXJwYXNzd29yZA=='
     && req.headers.authorization !== 'Basic b3RoZXJsb2dpbjpvdGhlcnBhc3N3b3Jk')        
    return res.status(401).send('Authentication required.')  

  
  res.send('hello world')
  
})

var server = app.listen(8080, "0.0.0.0", function () {  
    var host = server.address().address;  
    var port = server.address().port;  
    console.log('Example app listening at http://%s:%s', host, port);  
});  