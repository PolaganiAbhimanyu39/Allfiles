from django.urls import path
from . import views

urlpatterns = [
    path("index/",views.index,name="index"), # This line means when url ends with index after app. url it is visited represented by "index/" call index fun. in views file here, string 'name' is used to represent a name to a url-pattern with name(string-type-variable) we can easily refer this url-pattern
    path("harry/",views.harry,name="Harry"), # Below, lines say when url has harry or ron call the specified fun.
    path("ron/",views.ron,name="Ron"),
    path("<str:name>",views.greet,name="greet"), # This line states in <> - if you have a string in url then assign it to variable name and pass that variable to specified function
    path("",views.show,name="show"), #This line means when default url of app. is visited call greet fun.

]