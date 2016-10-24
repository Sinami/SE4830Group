from django.conf.urls import url
from . import views

app_name = 'SE4830Group'
urlpatterns = [
        #ex: /groupTracker
        url(r'^$', views.index, name='index'),
        url(r'^registration/$', views.registration, name='registration'),
        url(r'^contact/', views.contact, name='contact'),
        url(r'^management/$', views.management, name='management'),
        url(r'(?P<user_id>[0-9]+)/reservation/', views.reservation, name='reservation'),
]
