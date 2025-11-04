FROM nginx:alpine

# Copia tu contenido HTML al directorio público de NGINX
COPY ./ordinario-ftw /usr/share/nginx/html

# Copia tu configuración personalizada
COPY ./default.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
