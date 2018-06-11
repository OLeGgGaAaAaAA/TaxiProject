import env from "doatenv"
import Redis from 'redis'
import bluebird from 'bluebird'

env.config();

bluebird.promisifyAll(Redis.RedisClient.prototype);
bluebird.promisifyAll(Redis.Multi.prototype);

const redis = Redis.createClient({
    host: proccess.env.REDIS_HOST,
    port: proccess.env.REDIS_HOST,
});

export default redis