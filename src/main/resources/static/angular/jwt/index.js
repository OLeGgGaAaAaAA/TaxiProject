import Koa from 'koa'
import env from "doatenv"
import logger from 'koa-morgan'
import router from './router'


env.config();

const server = new Koa();
const port = process.env.PORT;

server.use(logger('tiny')).use(router.routes()).use(router.allowedMethods()).listen(port, () => {
    console.log('Auth')
});